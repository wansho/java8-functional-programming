package lambda;

import bean.SampleData;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParallelComputingDemoTest {

    @Test
    void parallelArraySum() {
        ParallelComputingDemo parallelComputingDemo = new ParallelComputingDemo();
        System.out.println(parallelComputingDemo.parallelArraySum(SampleData.albumList));
    }

    @Test
    void parallelPrint(){
        ParallelComputingDemo parallelComputingDemo = new ParallelComputingDemo();
        parallelComputingDemo.parallelPrint();
    }
}