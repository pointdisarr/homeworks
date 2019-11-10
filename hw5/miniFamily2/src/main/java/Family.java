import java.util.Arrays;

public class Family {
    static{
        System.out.println("the family has been created");
    }
    private Human mother;
    private Human father;
    private int countFamily = 1;
    private Human[] children = new Human[countFamily];
    private Pet pet = new Pet();


    Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        Human[] children;
    }

    public static void main(String[] args) {

        Human hr = new Human();
        System.out.println(hr.toString());


    }

    public void addChild(Human child) {

        Human[] morechild = new Human[children.length + 1];

        morechild[morechild.length - 1] = child;

        countFamily++;
    }

    private boolean deleteChild(int ind) {

        if (children == null || ind < 0 || ind > children.length) {
            return false;
        }

        Human[] lesschild = new Human[children.length - 1];

        for (int i = 0, k = 0; i < children.length; i++) {

            if (i == ind) {
                continue;
            }
            lesschild[k++] = children[i];
        }

        countFamily--;

        return true;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.getName() +
                ", father=" + father.getName() +
                ", countFamily=" + countFamily +
                ", children=" + Arrays.toString(children) +
                ", pet=" + getPet().getNickname() +
                '}';
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void deleteChild(Human child) {
        for (int i = 0; i < children.length; i++) {

            if (child.equals(this.children[i]) &&
                    child.hashCode() == this.children[i].hashCode()){
                deleteChild(i);
            }
        }
    }


    public Human[] getChildren() {
        Human[] copy = new Human[this.children.length];
        System.arraycopy(this.children, 0, copy, 0, copy.length);
        return copy;
    }

    public void setChildren(Human[] chldr) {
        this.children = new Human[chldr.length];
        System.arraycopy(chldr, 0, this.children, 0, chldr.length);
    }

}
