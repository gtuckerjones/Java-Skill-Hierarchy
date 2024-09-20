abstract class Skill 
{
    //properties
    protected String name;
    protected String type;
    protected int skillLevel;
    
    //constructor
    public Skill(String name, String type, int skillLevel)
    {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    //Accessors
    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public int getSkillLevel()
    {
        return skillLevel;
    }

    //abstract method
    abstract void identifySkill();
}