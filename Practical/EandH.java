package collections;
import java.util.*;
public class EandH extends equhash {
	public String name;
	   public int id;
	public EandH(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EandH other = (EandH) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	}
