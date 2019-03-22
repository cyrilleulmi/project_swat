package ch.hslu.appe.fbs.business.bill;

import ch.hslu.appe.fbs.data.bill.BillPersistorFactory;
import ch.hslu.appe.fbs.data.reminder.ReminderPersistorFactory;
import ch.hslu.appe.fbs.wrapper.BillWrapper;
import ch.hslu.appe.fbs.wrapper.OrderWrapper;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BillManagerFactoryTest {

    @Test
    public void whenGetBillManagerIsCalled_ThenReturnIsNotNull(){
        BillPersistorFactory billPersistorFactory = mock(BillPersistorFactory.class);
        ReminderPersistorFactory reminderPersistorFactory = mock(ReminderPersistorFactory.class);
        BillWrapper billWrapper = new BillWrapper();
        OrderWrapper orderWrapper = new OrderWrapper();
        BillManager testee = BillManagerFactory.getBillManager(billPersistorFactory, reminderPersistorFactory,
                                                                billWrapper, orderWrapper);
        assertThat(testee).isNotNull();
    }
}