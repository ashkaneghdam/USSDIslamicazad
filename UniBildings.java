public class UniBildings {
    private String name;
    private ClassRoom classRoom;
    private BildingManger bildingManger;

    public UniBildings(String name, ClassRoom classRoom, BildingManger bildingManger) {
        this.name = name;
        this.classRoom = classRoom;
        this.bildingManger = bildingManger;
    }

    public String getName() {
        return name;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public BildingManger getBildingManger() {
        return bildingManger;
    }
}
