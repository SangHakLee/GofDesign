package factorymethod.framework;

public abstract class ItemCreator {
	public Item create() {
		Item item;
		
		requestItemsInfo(); // step1
		item = createItem(); // step2
		createItemLog(); // step3
		
		return item;
	}
	
	// �������� �����ϱ� ���� ������ ���̽����� ���� ��û
	abstract protected void requestItemsInfo();
	
	// ������ ���� �� ������ ���� ���� �ҹ� ���� ����
	abstract protected void createItemLog();
	
	// ������ ���� �˰���
	abstract protected Item createItem();
}
