package entities.enums;

public enum Operations {

	MULTIPLICACAO {
		@Override
		public double aplicar(double a, double b) {
			return a * b;
		}
	},

	DIVISAO {
		@Override
		public double aplicar(double a, double b) {
			return a / b;
		}

	},

	SUBTRACAO {
		@Override
		public double aplicar(double a, double b) {
			return a - b;
		}
	},

	SOMA {
		@Override
		public double aplicar(double a, double b) {
			return a + b;
		}
	};

	public abstract double aplicar(double a, double b);

} // end of enum interface
