package lec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex057 {

    public static void main(String[] args) {
        List<Insect> insectList = Arrays.asList(
                new Insect(),
                new Butterfly(),
                new Locust(),
                new SwallowtailButterfly()
        );

        insectList.forEach(Insect::move);
    }

}
