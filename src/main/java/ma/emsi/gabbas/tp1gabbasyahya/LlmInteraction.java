package ma.emsi.gabbas.tp1gabbasyahya;

/**
 * Classe pour encapsuler une interaction complète avec le LLM.
 * Contient la requête JSON, la réponse JSON et le texte de la réponse extraite.
 */
public class LlmInteraction {
    /**
     * Texte formaté de la requête JSON envoyée à l'API.
     */
    private String texteRequeteJson;
    
    /**
     * Texte de la réponse JSON retournée par l'API.
     */
    private String texteReponseJson;
    
    /**
     * Texte simple de la réponse extraite du JSON.
     */
    private String reponse;

    /**
     * Constructeur complet.
     * @param texteRequeteJson le texte formaté de la requête JSON.
     * @param texteReponseJson le texte de la réponse JSON.
     * @param reponse le texte de la réponse extraite.
     */
    public LlmInteraction(String texteRequeteJson, String texteReponseJson, String reponse) {
        this.texteRequeteJson = texteRequeteJson;
        this.texteReponseJson = texteReponseJson;
        this.reponse = reponse;
    }

    public String questionJson() {
        return texteRequeteJson;
    }

    public String reponseJson() {
        return texteReponseJson;
    }

    public String reponseExtraite() {
        return reponse;
    }

    public String getTexteRequeteJson() {
        return texteRequeteJson;
    }

    public void setTexteRequeteJson(String texteRequeteJson) {
        this.texteRequeteJson = texteRequeteJson;
    }

    public String getTexteReponseJson() {
        return texteReponseJson;
    }

    public void setTexteReponseJson(String texteReponseJson) {
        this.texteReponseJson = texteReponseJson;
    }

    public String getReponse() {
        return reponse;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }
}
