package ch.hslu.appe.fbs.wrapper;

import ch.hslu.appe.fbs.common.dto.BillDTO;
import ch.hslu.appe.fbs.model.db.Bill;
import org.junit.Test;

import static org.junit.Assert.*;

public class BillWrapperTest {

    @Test
    public void dtoFromEntity_whenParameterIsEmptyBill_thenNoExceptionThrown() {
        BillWrapper testee = new BillWrapper();
        testee.dtoFromEntity(new Bill());
    }

    @Test
    public void dtoFromEntity_whenParameterIdSet_thenIdIsSameIdInDto() {
        BillWrapper testee = new BillWrapper();
        Bill bill = new Bill();
        bill.setId(14);
        BillDTO dto = testee.dtoFromEntity(bill);
        assertEquals(bill.getId(), dto.getId());
    }

    @Test
    public void dtoFromEntity_whenParameterPriceSet_thenDtoHasSamePrice() {
        BillWrapper testee = new BillWrapper();
        Bill bill = new Bill();
        bill.setPrice(14);
        BillDTO dto = testee.dtoFromEntity(bill);
        assertEquals(bill.getPrice(), dto.getPrice());
    }

    @Test
    public void dtoFromEntity_whenParameterOrderIdSet_thenDtoHasSameOrderId() {
        BillWrapper testee = new BillWrapper();
        Bill bill = new Bill();
        bill.setOrderId(14);
        BillDTO dto = testee.dtoFromEntity(bill);
        assertEquals(bill.getOrderId(), dto.getOrderId());
    }

    @Test
    public void entityFromDTO_whenParameterIdIsSet_then() {
        BillWrapper testee = new BillWrapper();

        BillDTO dto = new BillDTO(3, 15, 26);

        Bill bill = testee.entityFromDTO(dto);
        assertEquals(dto.getId(), bill.getId());
    }

    @Test
    public void entityFromDTO_whenParameterPriceIsSet_then() {
        BillWrapper testee = new BillWrapper();

        BillDTO dto = new BillDTO(3, 15, 26);

        Bill bill = testee.entityFromDTO(dto);
        assertEquals(dto.getPrice(), bill.getPrice());
    }

    @Test
    public void entityFromDTO_whenParameterOrderIdIsSet_then() {
        BillWrapper testee = new BillWrapper();

        BillDTO dto = new BillDTO(3, 15, 26);

        Bill bill = testee.entityFromDTO(dto);
        assertEquals(dto.getOrderId(), bill.getOrderId());
    }
}