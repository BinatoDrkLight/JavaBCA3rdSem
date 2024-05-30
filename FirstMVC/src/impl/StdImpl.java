package impl;
import encap.StdEncap;
import interf.StdInterf;
public class StdImpl implements StdInterf{

    @Override
    public void add(StdEncap stdEncap) {
      System.out.println(stdEncap.getNum1() + stdEncap.getNum2());
    }

    @Override
    public void subtract(StdEncap stdEncap) {
       System.out.println(stdEncap.getNum1() - stdEncap.getNum2());
    }
}
