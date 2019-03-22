package ch.hslu.appe.fbs.data.reminder;

public final class ReminderPersistorFactoryImpl implements ReminderPersistorFactory {

    public ReminderPersistorFactoryImpl() {
    }

    public ReminderPersistor createReminderPersistor() {
        return new ReminderPersistorJpa();
    }
}
