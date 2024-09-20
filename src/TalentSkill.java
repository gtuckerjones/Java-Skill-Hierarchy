public class TalentSkill extends Skill
{
    public TalentSkill(String name, String type, int skillLevel)
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
