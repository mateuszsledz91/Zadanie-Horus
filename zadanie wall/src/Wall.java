import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Wall implements Structure{
    private List<Block> blocks;



    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream().filter(block -> block.getColor().equals(color)).findFirst();  //zwraca pierwszy element o podanym kolorze
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream().filter(block -> block.getMaterial().equals(material)).collect(Collectors.toList());   //zwraca listę elementów o podanym materiale
    }

    @Override
    public int count() {
        return blocks.size();  //zwraca liczbę elementów
    }
}
