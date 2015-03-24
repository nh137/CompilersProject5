package Translate.Translate;

import Translate.Temp.Label;
import Translate.Tree.Stm;
import Translate.Tree.*;

public class Ex extends Exp{
	
	Translate.Tree.Exp exp;
	Ex(Translate.Tree.Exp e) {exp=e;}
	
	Translate.Tree.Exp unEx() {return exp;}
	
	Stm unNx() { 
		return new EXP(exp);
	}

	@Override
	
	Stm unCx(Label t, Label f) {
		// TODO Auto-generated method stub
		// determine whether 0 or not
		if (exp instanceof BINOP)
		{
		//TODO evaluate the binop here?
		//	if ((exp.binop == 4 && (exp.left && exp.right)|| (exp.binop == 5)
			return new JUMP(t);
		}else
			return new JUMP(f);
	}
	
}
