public class SoftSkill extends Skill
{
    public SoftSkill(String name, String type, int skillLevel)
    {
         //calling the super class's properties
        super(name, type, skillLevel);
    }

    //abstract method
    void identifySkill()
    {
        System.out.println(name + " Skill of " + type + " has a level of " + skillLevel);
    }

}
