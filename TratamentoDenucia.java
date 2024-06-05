

    private static List<Denuncia> denunciaList = new ArrayList<>();

    public Denuncia(int idDenuncia, int idAnimal, int idDenunciante, Date dataDenuncia, String descricao) {
        if (idDenuncia <= 0) {
            throw new IllegalArgumentException("ID da denúncia deve ser maior que zero.");
        }
        if (idAnimal <= 0) {
            throw new IllegalArgumentException("ID do animal deve ser maior que zero.");
        }
        if (idDenunciante <= 0) {
            throw new IllegalArgumentException("ID do denunciante deve ser maior que zero.");
        }
        if (dataDenuncia == null) {
            throw new IllegalArgumentException("Data da denúncia não pode ser nula.");
        }
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia.");
        }

        this.idDenuncia = idDenuncia;
        this.idAnimal = idAnimal;
        this.idDenunciante = idDenunciante;
        this.dataDenuncia = dataDenuncia;
        this.descricao = descricao;
    }

    public int getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(int idDenuncia) {
        if (idDenuncia <= 0) {
            throw new IllegalArgumentException("ID da denúncia deve ser maior que zero.");
        }
        this.idDenuncia = idDenuncia;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        if (idAnimal <= 0) {
            throw new IllegalArgumentException("ID do animal deve ser maior que zero.");
        }
        this.idAnimal = idAnimal;
    }

    public int getIdDenunciante() {
        return idDenunciante;
    }

    public void setIdDenunciante(int idDenunciante) {
        if (idDenunciante <= 0) {
            throw new IllegalArgumentException("ID do denunciante deve ser maior que zero.");
        }
        this.idDenunciante = idDenunciante;
    }

    public Date getDataDenuncia() {
        return dataDenuncia;
    }

    public void setDataDenuncia(Date dataDenuncia) {
        if (dataDenuncia == null) {
            throw new IllegalArgumentException("Data da denúncia não pode ser nula.");
        }
        this.dataDenuncia = dataDenuncia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia.");
        }
        this.descricao = descricao;
    }

    public void registrarDenuncia() {
        try {
            denunciaList.add(this);
            System.out.println("Denúncia registrada com sucesso para o animal ID: " + this.getIdAnimal());
        } catch (Exception e) {
            System.err.println("Erro ao registrar denúncia: " + e.getMessage());
        }
    }

    public static List<Denuncia> listarDenuncias() {
        try {
            return new ArrayList<>(denunciaList);
        } catch (Exception e) {
            System.err.println("Erro ao listar denúncias: " + e.getMessage());
            return new ArrayList<>();
        }
    }
