package OOPSeminar1;

import java.util.List;

public class HotDrinkMachine implements VendingMachine {
	private List<HotDrink> hotDrinks;

	public HotDrinkMachine(List<HotDrink> products) {
		this.hotDrinks = products;
	}

	public List<HotDrink> getHotDrinks() {
		return hotDrinks;
	}

	public void setHotDrinks(List<HotDrink> hotDrinks) {
		this.hotDrinks = hotDrinks;
	}

	@Override
	public Product getProduct(String name) {
		for (HotDrink item : hotDrinks) {
			if (item.getName().toLowerCase().equals(name.toLowerCase())) {
				return item;
			}
		}
		return null;
	}

	public Product getProduct(String name, double volume) {
		for (HotDrink item : hotDrinks) {
			if (item.getName().toLowerCase().equals(name.toLowerCase()) && item.getVolume() == volume) {
				return item;
			}
		}
		return null;
	}

	public Product getProduct(String name, double volume, int temperature) {
		for (HotDrink item : hotDrinks) {
			if (item.getName().toLowerCase().equals(name.toLowerCase()) && item.getVolume() == volume
					&& item.getTemperature() == temperature) {
				return item;
			}
		}
		return null;
	}

	public Product getProduct(String name, double volume, int temperature, double cost) {
		for (HotDrink item : hotDrinks) {
			if (item.getName().toLowerCase().equals(name.toLowerCase()) && item.getVolume() == volume
					&& item.getTemperature() == temperature && item.getCost() == cost) {
				return item;
			}
		}
		return null;
	}

	public void addHotDrink(HotDrink hotDrink) {
		this.hotDrinks.add(hotDrink);
	}
}
