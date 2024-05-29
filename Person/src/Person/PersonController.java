/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author p086gp
 */



public class PersonController {
    private Person model;
    private ConsoleView consoleView;
    private GUIView guiView;

    public PersonController(Person model, ConsoleView consoleView, GUIView guiView) {
        this.model = model;
        this.consoleView = consoleView;
        this.guiView = guiView;
    }

    public void updateView() {
        consoleView.printPersonDetails(model);
        guiView.showPersonDetails(model);
    }
}