0. Configure seu nome e e-mail:
git config user.name mentejoao
git config user.email joaozin@meta.com
1. Crie uma pasta chamada cs-aulagit
mkdir cs-aulagit
2. Entre na pasta e inicie um repositório local
cd cs-aulagit
git init
3. Verifique se o repositório foi criado
ls -la
4. Remova o repositório
rm -rf .git
5. Crie o repositório novamente
git init
6. Crie um arquivo chamado cs.txt e na primeira linha adicione o seu nome.
cat > cs.txt
Joao
7. Verifique se o status do arquivo é "Untracked files" (Status: work directory)
git status
8. Adiciona o arquivo ao "Stage" e verifique o status novamente (agora deve ser "Changes to be committed" - que indica a etapa de Staging area)
git add cs.txt
git status
9. Faça o commit desse arquivo no seu repositório local. Coloque o comentário "Arquivo cs.txt criado com o meu nome"
git commit -m "Arquivo cs.txt criado com o meu nome"
10. Verifique o status do repositório
git status
11. Verifique os arquivos sob o controle do git
git ls-files
