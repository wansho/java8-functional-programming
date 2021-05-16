package bean;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class SampleData {

    public static final Artist johnColtrane = new Artist("John Coltrane", "US");

    public static final Artist johnLennon = new Artist("John Lennon", "UK");
    public static final Artist paulMcCartney = new Artist("Paul McCartney", "UK");
    public static final Artist georgeHarrison = new Artist("George Harrison", "UK");
    public static final Artist ringoStarr = new Artist("Ringo Starr", "UK");
    public static final Artist jayChou = new Artist("周杰伦", "CN");
    public static final Artist puShu = new Artist("朴树", "CN");

    public static final List<Artist> membersOfTheBeatles = Arrays.asList(johnLennon, paulMcCartney, georgeHarrison, ringoStarr);

    public static final Artist theBeatles = new Artist("The Beatles", membersOfTheBeatles, "UK");

    public static final Album aLoveSupreme = new Album("A Love Supreme", asList(new Track("Acknowledgement", 467), new Track("Resolution", 442)), asList(johnColtrane));

    public static final Album sampleShortAlbum = new Album("sample Short Album", asList(new Track("short track", 30)), asList(paulMcCartney));

    public static final Album manyTrackAlbum = new Album("sample Short Album", asList(new Track("short track", 30), new Track("short track 2", 30), new Track("short track 3", 30), new Track("short track 4", 30), new Track("short track 5", 30)), asList(georgeHarrison));

    public static final Album qiLiXiang =  new Album("七里香",
            asList(new Track("七里香", 30),
                    new Track("园游会", 40),
                    new Track("搁浅", 50)
                    ),
            asList(jayChou));

    public static final Album fantasy =  new Album("范特西",
            asList(new Track("爱在西元前", 30),
                    new Track("简单爱", 90),
                    new Track("安静", 50)
            ),
            asList(jayChou));

    public static final Album lieHuXingZuo =  new Album("猎户星座",
            asList(new Track("在木星", 60),
                    new Track("园游会", 30),
                    new Track("搁浅", 80)
            ),
            asList(puShu));

    public static List<Album> albumList = Arrays.asList(fantasy, qiLiXiang, aLoveSupreme, sampleShortAlbum, manyTrackAlbum, lieHuXingZuo);
    public static Stream<Album> albums = albumList.stream();

    public static Stream<Artist> threeArtists() {
        return Stream.of(johnColtrane, johnLennon, theBeatles);
    }

    public static List<Artist> getThreeArtists() {
        return Arrays.asList(johnColtrane, johnLennon, theBeatles);
    }

}
