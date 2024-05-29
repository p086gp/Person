/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author gsz7010
 */

public class Main {
    public static void main(String[] args) {
        Person model = new Person("Szabolcs Gaspar", 1984);
        ConsoleView consoleView = new ConsoleView();
        GUIView guiView = new GUIView();
        PersonController controller = new PersonController(model, consoleView, guiView);

        controller.updateView();
    }
}
