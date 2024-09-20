public class App 
{
    public static void main(String[] args)
    {
        //creating instances
        HardSkill h = new HardSkill("Hard", "Programming", 5);
        SoftSkill s = new SoftSkill("Soft", "Communication", 8);
        GiftSkill g = new GiftSkill("Gift", "Mercy", 9);
        TalentSkill t = new TalentSkill("Talent", "Organization", 3);

        //calling the methods
        h.identifySkill();
        s.identifySkill();
        g.identifySkill();
        t.identifySkill();
    }
}
