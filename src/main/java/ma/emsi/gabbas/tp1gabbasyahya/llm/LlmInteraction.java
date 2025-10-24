package ma.emsi.gabbas.tp1gabbasyahya.llm;

/**
 * Record pour encapsuler l'interaction complète avec le LLM (requête JSON, réponse JSON et texte extrait).
 */
public record LlmInteraction(String texteRequeteJson, String texteReponseJson, String reponse) {

    public String questionJson() {
        return texteRequeteJson;
    }

    public String reponseJson() {
        return texteReponseJson;
    }

    public String reponseExtraite() {
        return reponse;
    }
}
