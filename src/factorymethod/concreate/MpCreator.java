package factorymethod.concreate;

import java.util.Date;

import factorymethod.framework.Item;
import factorymethod.framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("DB���� ���� ȸ�� ���� ���� ������");

	}

	@Override
	protected void createItemLog() {
		System.out.println("���� ȸ�� ���� ���� " + new Date() );

	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}
