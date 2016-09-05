package factorymethod.concreate;

import java.util.Date;

import factorymethod.framework.Item;
import factorymethod.framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("DB���� ü�� ȸ�� ���� ���� ������");

	}

	@Override
	protected void createItemLog() {
		System.out.println("ü�� ȸ�� ���� ���� " + new Date() );

	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}

}
