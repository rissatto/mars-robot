package gov.nasa.robot.enumeration;

/**
 * Enum responsavel pelos pontos cardeais e pelos valores necessarios para movimentacao no eixo x e y
 * 
 * @author elison.rissatto
 */
public enum Orientation {
	
	NORTH(0, 1, "N"){

		@Override
		public Orientation getLeft() {
			return Orientation.WEST;
		}

		@Override
		public Orientation getRight() {
			return Orientation.EAST;
		}
		
	},
	SOUTH(0, -1, "S"){

		@Override
		public Orientation getLeft() {
			return Orientation.EAST;
		}

		@Override
		public Orientation getRight() {
			return Orientation.WEST;
		}
		
	},
	EAST(1, 0, "E"){

		@Override
		public Orientation getLeft() {
			return Orientation.NORTH;
		}

		@Override
		public Orientation getRight() {
			return Orientation.SOUTH;
		}
		
	},
	WEST(-1, 0, "W"){

		@Override
		public Orientation getLeft() {
			return Orientation.SOUTH;
		}

		@Override
		public Orientation getRight() {
			return Orientation.NORTH;
		}
		
	};
	
	private Integer xToAhead;
	private Integer yToAhead;
	private String acronym;
	
	public abstract Orientation getLeft();
	public abstract Orientation getRight();
	
	private Orientation(Integer xToAhead, Integer yToAhead, String acronym) {
		this.xToAhead = xToAhead;
		this.yToAhead = yToAhead;
		this.acronym = acronym;
	}
	
	public Integer getXToAhead() {
		return xToAhead;
	}
	
	public void setXToAhead(Integer xToAhead) {
		this.xToAhead = xToAhead;
	}
	
	public Integer getYToAhead() {
		return yToAhead;
	}
	
	public void setYToAhead(Integer yToAhead) {
		this.yToAhead = yToAhead;
	}
	
	public String getAcronym() {
		return acronym;
	}
	
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
}
