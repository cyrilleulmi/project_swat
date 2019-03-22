package ch.hslu.appe.fbs.data.bill;

public final class BillPersistorFactoryImpl implements BillPersistorFactory {

    public BillPersistorFactoryImpl() {
    }

    public BillPersistor createBillPersistor() {
        return new BillPersistorJpa();
    }
}
