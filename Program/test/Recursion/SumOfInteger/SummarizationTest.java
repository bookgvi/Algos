package Recursion.SumOfInteger;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class SummarizationTest {
  @Deployment
  public static JavaArchive createDeployment() {
    return ShrinkWrap.create(JavaArchive.class)
      .addClass(Summarization.class)
      .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
  }

  @org.junit.Test
  public void sum_of_integers() {
    Summarization summarization = new Summarization(10);
    IntStream.rangeClosed(1, 30).forEach((i) -> {
      int result = summarization.proceed1(i);
      int control = (1 + i) * i / 2;
      assertEquals("i = " + i, control, result);
    });
  }

  @org.junit.Test
  public void sum_of_integers_using_array() {
    Summarization summarization = new Summarization(10);
    IntStream.rangeClosed(1, 30).forEach((i) -> {
      int resultViaArray = summarization.proceed(IntStream.rangeClosed(1, i).toArray(), i);
      int control = (1 + i) * i / 2;
      assertEquals("i = " + i, control, resultViaArray);
    });
  }
}
