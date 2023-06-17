Feature: Prise de rendez-vous

	Scenario: Rendez-vous médical Medicaid
		Given Je suis sur la page d accueil
		And Je me connecte
		When Je prends un rdv médical Medicaid
		Then Les informations du rdv sont validées et affichées
