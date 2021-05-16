package lambda;

import bean.Album;
import bean.SampleData;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class CollectorDemoTest {

    @Test
    void nameOfAlbums() {
        CollectorDemo collectorDemo = new CollectorDemo();
        System.out.println(collectorDemo.nameOfAlbums(SampleData.albums));
    }
}