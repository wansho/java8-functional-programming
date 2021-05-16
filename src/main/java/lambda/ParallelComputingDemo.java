package lambda;

import bean.Album;
import bean.Track;

import java.util.List;

public class ParallelComputingDemo {

    /**
     * 并行计算所有专辑的歌的时长
     * @param albumList
     * @return
     */
    public int parallelArraySum(List<Album> albumList) {
        return albumList.parallelStream()
                .flatMap(album -> album.getTracks())
                .mapToInt(Track::getLength)
                .sum();
    }

    /**
     * 并行求和
     * @param values
     * @return
     */
    public int addIntegers(List<Integer> values) {
        return values.parallelStream()
                .mapToInt(i -> i)
                .sum();
    }



}
