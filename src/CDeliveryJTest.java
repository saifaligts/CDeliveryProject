import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;



public class CDeliveryJTest {
	CDelivery Cobj = new CDelivery();
	
	@Test
	public void PriceForDistanceLessThan10KM() {
		Assert.assertEquals(10, Cobj.PriceForDistance(8));
	}
	@Test
	public void PriceForDistanceGreaterThan10KM() {
		Assert.assertEquals(25, Cobj.PriceForDistance(15));
	}
	@Test
	public void PriceForDistanceLessThan10KMWithStairs() {
		Assert.assertEquals(20, Cobj.PriceForDistanceAndStairs(7));
	}
	@Test
	public void PriceForDistanceGreaterThan10KMWithStairs() {
		Assert.assertEquals(35, Cobj.PriceForDistanceAndStairs(18));
	}
	@Test
	public void PriceForWeekend() {
		Assert.assertEquals(50, Cobj.Weekend());
	}
}
