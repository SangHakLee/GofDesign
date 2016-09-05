package factorymethod.framework;

public abstract class ItemCreator {
	public Item create() {
		Item item;
		
		requestItemsInfo(); // step1
		item = createItem(); // step2
		createItemLog(); // step3
		
		return item;
	}
	
	// 아이템을 생성하기 전에 데이터 베이스에서 정보 요청
	abstract protected void requestItemsInfo();
	
	// 아이템 생성 후 아이템 복제 등의 불법 방지 위함
	abstract protected void createItemLog();
	
	// 아이템 생성 알고리즘
	abstract protected Item createItem();
}
