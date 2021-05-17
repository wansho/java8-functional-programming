package lambda;

import bean.Album;
import bean.Track;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    /**
    * 并行打印，看看结果
    * @param
    * @return
    */
    public void parallelPrint(){
        IntStream.range(0, 10).parallel().forEach(i -> {
            System.out.println(i);
        });
    }



}
