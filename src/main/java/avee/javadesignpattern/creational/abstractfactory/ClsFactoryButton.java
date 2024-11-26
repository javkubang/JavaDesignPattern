package avee.javadesignpattern.creational.abstractfactory;

public class ClsFactoryButton extends ClsAbstractFactory {

    public static InterfaceRenderer getButtonObject() {
        return new ClsButton();
    }
}
