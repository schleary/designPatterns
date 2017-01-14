package behavioral.visitor;


import apple.awt.CPanel;

public class Light extends CarPart{
    @Override
    void print() {
        System.out.println("Light");
    }

    @Override
    void render() {
        System.out.println("Render light");
    }

    @Override
    void upgrade() {
        System.out.println("Upgrade light");
    }
}
