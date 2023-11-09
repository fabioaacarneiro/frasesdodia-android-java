package com.fabioaacarneiro.frasesdodia;

import java.util.Random;

public class Frases {
    private String[] listaDeFrases = {
            "Ter um dia leve e feliz só depende de você. Faça acontecer!",
            "Nunca perca a esperança de que dias melhores virão! ",
            "Comece o dia sempre com esta certeza: tudo passa!",
            "Há sempre um novo dia e uma nova chance se você se permitir.  ",
            "O que você transmitir volta com intensidade.",
            "Carregue seu melhor sorriso aonde quer que vá. Ele pode iluminar o dia de alguém.",
            "A esperança é a chama que nos mantém acesos durante as noites mais escuras e nos guia para um futuro melhor, cheio de possibilidades e alegrias.",
            "Um sorriso sincero pode iluminar o dia de quem está ao seu redor.",
            "A felicidade não é apenas uma emoção individual, mas pode ser compartilhada com outras pessoas por pequenos atos de amor e bondade.",
            "Ame a pessoa que você vê no espelho todos os dias, porque ela é a única que estará sempre lá por você em todos os momentos da vida.",
            "Ao escolhermos acreditar em um mundo melhor, nos tornamos agentes da mudança e construtores do futuro que queremos ver.",
            "Quando acreditamos em nós mesmos, conseguimos alcançar coisas incríveis e transformar nossos sonhos em realidade.",
            "Mesmo nos momentos mais difíceis, a esperança é a força que nos mantém de pé e nos leva em direção à luz.",
            "Quando acreditamos em um mundo melhor, abrimos espaço para a transformação e a criação de um futuro mais brilhante.",
            "Seja gentil e cuidadoso com as pessoas ao nosso redor e crie um mundo mais amoroso e harmonioso.",
            "A confiança em si é a chave para desbloquear todo o potencial que existe dentro de você.",
            "A esperança é a semente que plantamos hoje para colher um mundo melhor amanhã.",
            "Quando aprendemos a nos amar e nos aceitar como somos, irradiamos amor para o mundo.",
            "A esperança é a certeza de que, mesmo quando tudo parece perdido, há sempre uma chance de recomeçar e fazer tudo de novo.",
            "O amor-próprio é a base para uma vida feliz e plena, porque nos permite honrar nossas necessidades e desejos mais profundos.",
            "Às vezes, precisamos apenas de um pouco de bondade para transformar um dia comum em especial.",
            "Quando mantemos a esperança no coração, superamos qualquer obstáculo e alcançamos nossos sonhos mais incríveis."
    };

    public String sortPhrase() {
        return this.listaDeFrases[new Random().nextInt(this.listaDeFrases.length)];
    }

    public String[] getAllPhrases() {
        return this.listaDeFrases;
    }
}
