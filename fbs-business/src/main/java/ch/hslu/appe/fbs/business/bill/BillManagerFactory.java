package ch.hslu.appe.fbs.business.bill;

import ch.hslu.appe.fbs.data.bill.BillPersistorFactory;
import ch.hslu.appe.fbs.data.bill.BillPersistorFactoryImpl;
import ch.hslu.appe.fbs.data.reminder.ReminderPersistorFactory;
import ch.hslu.appe.fbs.data.reminder.ReminderPersistorFactoryImpl;
import ch.hslu.appe.fbs.wrapper.BillWrapper;
import ch.hslu.appe.fbs.wrapper.OrderWrapper;

public final class BillManagerFactory {

    private BillManagerFactory() {
    }

    public static BillManager getBillManager() {
        return getBillManager(new BillPersistorFactoryImpl(), new ReminderPersistorFactoryImpl(), new BillWrapper(), new OrderWrapper());
    }

    public static BillManager getBillManager(BillPersistorFactory billPersistorFactory, ReminderPersistorFactory reminderPersistorFactory, BillWrapper billWrapper, OrderWrapper orderWrapper) {
        return new BillManagerImpl(billPersistorFactory, reminderPersistorFactory, billWrapper, orderWrapper);
    }
}
