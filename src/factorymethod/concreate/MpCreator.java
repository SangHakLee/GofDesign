package factorymethod.concreate;

import java.util.Date;

import factorymethod.framework.Item;
import factorymethod.framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("DB에서 마력 회복 물약 정보 가져옴");

	}

	@Override
	protected void createItemLog() {
		System.out.println("마력 회복 물약 생성 " + new Date() );

	}

	@Override
	protected Item createItem() {
		return new MpPotion();
	}

}
