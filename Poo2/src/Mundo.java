
public class Mundo 
{
	
	private Integer WorldLimitX;
	private Integer WorldLimitY;
	private String WorldName; 
	
	public Mundo() 
	{
		super();
	}
	
	public Mundo(String WorldName, Integer WorldLimitX, Integer WorldLimitY)
	{
		this.WorldName = WorldName;
		this.WorldLimitX = WorldLimitX;
		this.WorldLimitY = WorldLimitY;
	}
	
	public String getWorldName()
	{
		return this.WorldName;
	}
	
	public Integer getWorldLimitX()
	{
		return WorldLimitX;
	}
	
	public Integer getWorldLimitY()
	{
		return WorldLimitY;
	}
	
	public void setWorldLimitX(Integer WorldLimitX)
	{
		this.WorldLimitX = WorldLimitX;
	}
	
	public void setWorldLimitY(Integer WorldLimitY)
	{
		this.WorldLimitY = WorldLimitY;
	}
	
	public void setWorldName(String WorldName)
	{
		this.WorldName = WorldName;
	}
	
	
}
