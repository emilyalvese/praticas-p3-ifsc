package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		
		Professor prof = new Professor();
		prof.setCpf("04807428985");
		prof.setNome("Josiane");
		prof.setSiape(10);
		System.out.println(prof.getCpf());
		System.out.println(prof.getNome());
		System.out.println(prof.getSiape());
		
		Aluno aluno = new Aluno();
		aluno.setCpf("13093824923");
		aluno.setMatricula(2021117006);
		aluno.setNome("Emily");
		System.out.println(aluno.getCpf());
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMatricula());
		
	}

}
