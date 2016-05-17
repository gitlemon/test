package com.ts;

public class JGitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileRepositoryBuilder repositoryBuilder = new FileRepositoryBuilder();

		repositoryBuilder.setMustExist( true );

		repositoryBuilder.setGitDir("D：\\");

		Repository repository = repositoryBuilder.build();
	}

}
