package ganymedes01.headcrumbs.renderers.heads.grimoireOfGaia;

import ganymedes01.headcrumbs.renderers.ModelHead;

import com.mojang.authlib.GameProfile;

public class SelkieHead extends ModelHead {

	public static final SelkieHead INSTANCE = new SelkieHead();

	protected SelkieHead() {
	}

	@Override
	public void preRender(GameProfile profile) {
		init();
	}

	@Override
	public void init() {
	}
}