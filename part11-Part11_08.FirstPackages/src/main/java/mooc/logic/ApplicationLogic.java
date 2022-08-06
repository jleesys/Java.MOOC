package mooc.logic;

import mooc.ui.TextInterface;
import mooc.ui.UserInterface;

public class ApplicationLogic {
    private UserInterface uinter;

    public ApplicationLogic(UserInterface ui) {
        this.uinter = ui;
    }

    public void execute(int times) {
        for (int i = 0;i<times;i++) {
            System.out.println("Application logic is working");
            uinter.update();
        }
    }
}
