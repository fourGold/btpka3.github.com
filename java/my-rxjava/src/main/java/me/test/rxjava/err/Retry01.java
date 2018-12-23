package me.test.rxjava.err;

import io.reactivex.Flowable;

/**
 * https://github.cm/ReactiveX/RxJava/wiki/Error-Handling-Operators#onerrorresumenext
 */
public class Retry01 {


    public static void main(String[] args) throws InterruptedException {

        test();

    }


    public static void test() throws InterruptedException {


        Flowable.range(0, 5)
                .map(i -> {
                    if (i == 2) {
                        throw new RuntimeException("MockError");
                    }
                    return "a" + i;
                })

                .retry(3, err -> err.getMessage().contains("MockError"))
                .subscribe(
                        d -> System.out.println("data : " + d),
                        err -> System.out.println("error : should not printed. : " + err),
                        () -> System.out.println("Done")
                );
    }

}
