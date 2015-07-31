package ats;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class RobotTest {

	@Test
	public void moveCalledSensorIsInContact() {
		
		Sensor sensor = Mockito.mock(Sensor.class);
		
		Robot rob = new Robot(sensor);
		
		rob.move();

		Mockito.verify(sensor).isInContact();
		
	}

	@Test
	public void moveChangeDirectionisInContactTrue() {
		
		/* Arrange */
		
		Sensor sensor = Mockito.mock(Sensor.class);
		
		Mockito.when(sensor.isInContact()).thenReturn(true);
		
		Robot rob = new Robot(sensor);
		
		rob.setDirection(Direction.north());

		
		/* Act */
		
		rob.move();
		
		/* Assert */
		
		Mockito.verify(sensor).isInContact();
		
		Assert.assertEquals(Direction.north().getInverse(), rob.getDirection());
		
	}
	
	
	
	@Test
	public void moveChangeDirectionisInContactFalse() {
		
		/* Arrange */
		
		Sensor sensor = Mockito.mock(Sensor.class);
		Mockito.when(sensor.isInContact()).thenReturn(false);
		Robot rob = new Robot(sensor);

		rob.setDirection(Direction.north());

		
		/* Act */
		
		rob.move();
		
		
		/* Assert */
		
		Mockito.verify(sensor).isInContact();
		
		Assert.assertEquals(Direction.north(), rob.getDirection());
	}
	
	
	
	
}
