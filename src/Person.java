
class Person {
		private float _height;
		private float _weight;

		public Person() {
			this._height = 6;
			this._weight = 200 ;
		}

		public void walks() {
			this._weight *= 0.9;
			System.out.println("You lost weight!");
			System.out.println("You weigh: " + this._weight + " lbs");
		}

		public void eats() {
			this._weight *= 1.20;
			System.out.println("You gained weight!");
			System.out.println("You weigh: " + this._weight + " lbs");
		}
	}