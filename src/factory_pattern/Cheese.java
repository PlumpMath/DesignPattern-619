/**
 * @project DesignPattern
 * @package factory_pattern
 * @filename Cheese.java
 */
package factory_pattern;
/**
 * @author xsh
 * @Email xshqhua@foxmail.com
 * @date 2016年8月18日 下午9:23:48
 */
public class Cheese extends Pizza {

	/* (non-Javadoc)
	 * @see factory_pattern.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Pizza start prepare.");
		System.out.println("Prepare "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		for(int i=0;i<topping.size();i++){
			System.out.println("\t"+topping.get(i));
		}
	}

}
