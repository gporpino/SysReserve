package br.fir.labpoo.ccg.reserve.model;

public abstract class BasicClass {
	
	public abstract int getId();
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BasicClass){
			BasicClass basic = (BasicClass)obj;
			if (this.getClass() == basic.getClass()){
				if (this.getId() == basic.getId()){
					return true;
				}
			}
		}
		return false;
	}
	
	public abstract BasicClass clone();
	
}
