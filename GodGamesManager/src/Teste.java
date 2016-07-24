import java.util.List;

import model.Register;
import dao.Database;
import exception.CommunicationFailureException;


public class Teste {
	public static void main(String[] args) throws CommunicationFailureException {
		Database database = new Database("localhost", "teste", "root", "noway");
//		database.insertRegister(new Register("28/03/2016", "14:27", "18:27", 3, true, (float) 8.50));
//		database.insertRegister(new Register("28/03/2016", "18:30", "17:00", 2, true, (float) 0.50));
		List<Register> registers = database.getRegistersByCurrentDate();
		for (Register reg : registers) {
			System.out.println(reg.getDate() + " " + reg.getStartTime() + " " + reg.getFinishTime() + " "
								+ reg.getTv() + " " + reg.isPaid() + " " + reg.getValue());
		}
	}
}
