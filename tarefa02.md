# CLI - Git 
### 0. Configure seu nome e e-mail:
    git config user.name mentejoao
    git config user.email joaozin@meta.com
### 1. Crie uma pasta chamada cs-aulagit
    mkdir cs-aulagit
### 2. Entre na pasta e inicie um repositório local
    cd cs-aulagit
    git init
### 3. Verifique se o repositório foi criado
    ls -la
### 4. Remova o repositório
    rm -rf .git
### 5. Crie o repositório novamente
    git init
### 6. Crie um arquivo chamado cs.txt e na primeira linha adicione o seu nome.
    cat > cs.txt
    Joao
### 7. Verifique se o status do arquivo é "Untracked files" (Status: work directory)
    git status
### 8. Adiciona o arquivo ao "Stage" e verifique o status novamente (agora deve ser "Changes to be committed" - que indica a etapa de Staging area)
    git add cs.txt
    git status
### 9. Faça o commit desse arquivo no seu repositório local. Coloque o comentário "Arquivo cs.txt criado com o meu nome"
    git commit -m "Arquivo cs.txt criado com o meu nome"
### 10. Verifique o status do repositório
    git status
### 11. Verifique os arquivos sob o controle do git
    git ls-files
### 12. Altere o arquivo cs.txt: inclua uma nova linha com o nome da disciplina.
	nano cs.txt
 	Construção de Software
### 13. Crie um novo arquivo chamado engenharia-software.txt e no conteúdo dê uma descrição do curso (2 ou 3 linhas).
	cat > engenharia-software.txt
 	O curso de Engenharia de Software abrange o estudo e prática do desenvolvimento de software, incluindo conceitos de análise, projeto, implementação e manutenção de sistemas computacionais
### 14. Verifique o satus dos dois arquivos e procure entender a diferença
	git status
### 15. Verifique os arquivos sob o controle do git novamente (git ls-files). Ambos os arquivos são listados? por que (procure entender e se não souber pesquise/pergunte)?
* Não, apenas o arquivo cs.txt é listado. O git não reconhece a existência de engenharia-software.txt pelo fato de não estar na área de Stage, sendo necessário adicioná-lo, caso desejássemos sua listagem.
### 16. Adicione os dois arquivo para "Staged area": 
	git add .
### 17. Retorne o arquivo cs.txt para a etapa de Work directory
	git reset cs.txt
### 18. Verifique o status e "entenda" que os dois arquivos estão em etapa diferentes (Work Directory e Staged area)
👍
### 19. Adicione no arquivo cs.txt mais uma linha: "INF - Instituto de Informatica"
	nano cs.txt
	INF - Instituto de Informatica
### 20. "Mova" esse arquivo para Staged
	git add cs.txt
### 21. Faça o commit dos dois arquivos com o seguinte comentário: "Definição do Curso de Engenharia de Software do INF"
	git commit -m "Definição do Curso de Engenharia de Software do INF"
### 22. Verifique o "log" de mudanças
	git log
### 23. Verifique o "log" de mudanças do arquivo "cs.txt"
	git log cs.txt
### 24. Altere o arquivo "cs.txt" adicionando a seguinte linha: "UFG - Universidade Federal de Goiás"
	nano cs.txt
	UFG - Universidade Federal de Goiás
### 25. Verifique a diferença entre a versão "comitada" e a versão atual do arquivo cs.txt
	git diff cs.txt
### 26 Adicione o arquivo cs.txt ao Staged area
	git add cs.txt
### 27. Volte o arquivo cs.txt para o working directory. 
	git reset cs.txt
### 28. Agora mova o arquivo para a area de Staged e depois faça o commit. Não esqueça o comentário:
	git add cs.txt
	git commit -m "Adicionando a UFG - Universidade Federal de Goiás em cs.txt"
### 29. Veja os branches existentes
	git branch
### 30. Crie um novo "branch" chamado "develop" e entre nele
	git checkout -b develop
### 31. Vejas os branches existentes
	git branch
### 32. Faça uma mudança no arquivo "engenharia-software.txt". Adicione uma linha com a carga horaria total do curso.
	nano engenharia-software.txt
	3200h
### 33. Crie um outro arquivo com o nome estudo-git.txt e, dentro dele, explique brevemente o comando "git status"
	cat estudo-git.txt
	Mostra informações como quais arquivos foram modificados, quais estão prontos para serem commitados e quais não estão sendo rastreados pelo Git
### 34. Verifique o status dos arquivos
	git status
### 35. Move os arquivos para Staged area e depois faça o commit.
	git add .
	git commit -m "Adição do arquivo estudos-git.txt e edição em engenharia-software.txt"
### 36. Mude para a branch master
	git checkout master
### 37. Verifique se o arquivo "estudo-git.txt" está na branch master.
    git ls-files
### 38. Verifique se a mudança realizada existe no arquivo "engenharia-software.txt". Pesquise/pergunte se não conseguiu entender o motivo da mudança não constar aqui.
* Não existe mudança, porque estamos em uma branch em que o arquivo engenharia-software.txt não foi alterado.
### 39. Faça o "merge" das mudanças realizadas no "develop" para a branch "master"

##### 39.1 Certifique-se que está na master
    git branch
##### 39.2. Faça o merge
    git merge develop
### 40. Apague a branch "develop"
    git branch -D develop
### 41. Verifique se a branch foi excluída
    git branch
