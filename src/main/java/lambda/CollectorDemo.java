package lambda;

import bean.Album;
import bean.Artist;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;
import java.util.stream.Stream;

/**
 * @author wanshuo
 * @date 2021-05-16 20:18:56
 */
public class CollectorDemo {
    /**
    * 使用收集器求每个艺术家的专辑名, toList() 表示用什么集合类来存储结果
    * @param
    * @return
    */
    public Map<Artist, List<String>> nameOfAlbums(Stream<Album> albums) {
        return albums.collect(groupingBy(Album::getMainMusician,
                mapping(Album::getName, toList())));
    }
}
