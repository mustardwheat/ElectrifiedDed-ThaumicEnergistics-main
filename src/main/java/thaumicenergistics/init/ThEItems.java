package thaumicenergistics.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import appeng.api.definitions.IItemDefinition;

import thaumicenergistics.api.IThEItems;
import thaumicenergistics.client.render.IThEModel;
import thaumicenergistics.definitions.ThEItemDefinition;
import thaumicenergistics.item.*;
import thaumicenergistics.item.part.*;
import thaumicenergistics.util.ThELog;

/**
 * @author BrockWS
 */
@Mod.EventBusSubscriber
public class ThEItems implements IThEItems {

    public static List<ItemBase> ITEMS = new ArrayList<>();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ThELog.info("Registering {} Items", ThEItems.ITEMS.size());
        event.getRegistry().registerAll(ThEItems.ITEMS.toArray(new ItemBase[0]));
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        ThEItems.ITEMS.forEach(item -> {
            if (item instanceof IThEModel) {
                ((IThEModel) item).initModel();
            }
        });
    }

    private static IItemDefinition createItem(ItemBase item) {
        ThEItems.ITEMS.add(item);
        return new ThEItemDefinition(item);
    }

    private final IItemDefinition itemEssentiaCell1k;
    private final IItemDefinition itemEssentiaCell4k;
    private final IItemDefinition itemEssentiaCell16k;
    private final IItemDefinition itemEssentiaCell64k;
    private final IItemDefinition itemEssentiaCell256k;
    private final IItemDefinition itemEssentiaCell1024k;
    private final IItemDefinition itemEssentiaCell4096k;
    private final IItemDefinition itemEssentiaCell16384k;
    private final IItemDefinition itemEssentiaCell65536k;
    private final IItemDefinition itemEssentiaCell262144k;
    private final IItemDefinition itemEssentiaCell1048576k;



    private final IItemDefinition itemEssentiaCellCreative;
    private final IItemDefinition itemEssentiaImportBus;
    private final IItemDefinition itemEssentiaExportBus;
    private final IItemDefinition itemEssentiaStorageBus;
    private final IItemDefinition itemEssentiaTerminal;
    private final IItemDefinition itemArcaneTerminal;
    private final IItemDefinition itemArcaneInscriber;
    private final IItemDefinition itemDiffusionCore;
    private final IItemDefinition itemCoalescenceCore;
    private final IItemDefinition itemPrimalIngot;
    private final IItemDefinition itemEssentiaComponent1k;
    private final IItemDefinition itemEssentiaComponent4k;
    private final IItemDefinition itemEssentiaComponent16k;
    private final IItemDefinition itemEssentiaComponent64k;
    private final IItemDefinition itemEssentiaComponent256k;
    private final IItemDefinition itemEssentiaComponent1024k;
    private final IItemDefinition itemEssentiaComponent4096k;
    private final IItemDefinition itemEssentiaComponent16384k;
    private final IItemDefinition itemEssentiaComponent65536k;
    private final IItemDefinition itemEssentiaComponent262144k;
    private final IItemDefinition itemEssentiaComponent1048576k;



    private final IItemDefinition itemUpgradeArcane;

    private final IItemDefinition itemKnowledgeCore;
    private final IItemDefinition itemBlankKnowledgeCore;
    private final IItemDefinition itemDummyAspect;

    public ThEItems() {

        this.itemEssentiaCell1k = ThEItems.createItem(new ItemEssentiaCell("1k", 1024, 8));
        this.itemEssentiaCell4k = ThEItems.createItem(new ItemEssentiaCell("4k", 1024 * 4, 8));
        this.itemEssentiaCell16k = ThEItems.createItem(new ItemEssentiaCell("16k", 1024 * 16, 16));
        this.itemEssentiaCell64k = ThEItems.createItem(new ItemEssentiaCell("64k", 1024 * 64, 16));
        this.itemEssentiaCell256k = ThEItems.createItem(new ItemEssentiaCell("256k", 1024 * 256, 32));
        this.itemEssentiaCell1024k = ThEItems.createItem(new ItemEssentiaCell("1024k", 1024 * 1024, 64));
        this.itemEssentiaCell4096k = ThEItems.createItem(new ItemEssentiaCell("4096k", 1024 * 4096, 64));
        this.itemEssentiaCell16384k = ThEItems.createItem(new ItemEssentiaCell("16384k", 1024 * 16384, 128));
        this.itemEssentiaCell65536k = ThEItems.createItem(new ItemEssentiaCell("65536k", 1024 * 65536, 128));
        this.itemEssentiaCell262144k = ThEItems.createItem(new ItemEssentiaCell("262144k", 1024 * 262144, 256));
        this.itemEssentiaCell1048576k = ThEItems.createItem(new ItemEssentiaCell("1048576k", 1024 * 1048576, 256));



















        this.itemEssentiaCellCreative = ThEItems.createItem(new ItemCreativeEssentiaCell());
        this.itemEssentiaImportBus = ThEItems.createItem(new ItemEssentiaImportBus("essentia_import"));
        this.itemEssentiaExportBus = ThEItems.createItem(new ItemEssentiaExportBus("essentia_export"));
        this.itemEssentiaStorageBus = ThEItems.createItem(new ItemEssentiaStorageBus("essentia_storage"));
        this.itemEssentiaTerminal = ThEItems.createItem(new ItemEssentiaTerminal("essentia_terminal"));
        this.itemArcaneTerminal = ThEItems.createItem(new ItemArcaneTerminal("arcane_terminal"));
        this.itemArcaneInscriber = ThEItems.createItem(new ItemArcaneInscriber("arcane_inscriber"));
        this.itemDiffusionCore = ThEItems.createItem(new ItemMaterial("diffusion_core"));
        this.itemCoalescenceCore = ThEItems.createItem(new ItemMaterial("coalescence_core"));
        this.itemPrimalIngot = ThEItems.createItem(new ItemMaterial("primal_ingot"));
        this.itemEssentiaComponent1k = ThEItems.createItem(new ItemMaterial("essentia_component_1k"));
        this.itemEssentiaComponent4k = ThEItems.createItem(new ItemMaterial("essentia_component_4k"));
        this.itemEssentiaComponent16k = ThEItems.createItem(new ItemMaterial("essentia_component_16k"));
        this.itemEssentiaComponent64k = ThEItems.createItem(new ItemMaterial("essentia_component_64k"));
        this.itemEssentiaComponent256k = ThEItems.createItem(new ItemMaterial("essentia_component_256k"));
        this.itemEssentiaComponent1024k = ThEItems.createItem(new ItemMaterial("essentia_component_1024k"));
        this.itemEssentiaComponent4096k = ThEItems.createItem(new ItemMaterial("essentia_component_4096k"));
        this.itemEssentiaComponent16384k = ThEItems.createItem(new ItemMaterial("essentia_component_16384k"));
        this.itemEssentiaComponent65536k = ThEItems.createItem(new ItemMaterial("essentia_component_65536k"));
        this.itemEssentiaComponent262144k = ThEItems.createItem(new ItemMaterial("essentia_component_262144k"));
        this.itemEssentiaComponent1048576k = ThEItems.createItem(new ItemMaterial("essentia_component_1048576k"));













        this.itemUpgradeArcane = ThEItems.createItem(new ItemMaterial("upgrade_arcane"));

        this.itemKnowledgeCore = ThEItems.createItem(new ItemKnowledgeCore("knowledge_core", false));
        this.itemBlankKnowledgeCore = ThEItems.createItem(new ItemKnowledgeCore("blank_knowledge_core", true));
        this.itemDummyAspect = ThEItems.createItem(new ItemDummyAspect());
    }

    @Override
    public IItemDefinition essentiaCell1k() {
        return this.itemEssentiaCell1k;
    }

    @Override
    public IItemDefinition essentiaCell4k() {
        return this.itemEssentiaCell4k;
    }

    @Override
    public IItemDefinition essentiaCell16k() {
        return this.itemEssentiaCell16k;
    }

    @Override
    public IItemDefinition essentiaCell64k() {
        return this.itemEssentiaCell64k;
    }

    @Override
    public IItemDefinition essentiaCell256k() {
        return this.itemEssentiaCell256k;
    }

    @Override
    public IItemDefinition essentiaCell1024k() {
        return this.itemEssentiaCell1024k;
    }

    @Override
    public IItemDefinition essentiaCell4096k() {
        return this.itemEssentiaCell4096k;
    }

    @Override
    public IItemDefinition essentiaCell16384k() {
        return this.itemEssentiaCell16384k;
    }

    @Override
    public IItemDefinition essentiaCell65536k() {
        return this.itemEssentiaCell65536k;
    }

    @Override
    public IItemDefinition essentiaCell262144k() {
        return this.itemEssentiaCell262144k;
    }

    @Override
    public IItemDefinition essentiaCell1048576k() {
        return this.itemEssentiaCell1048576k;
    }







    @Override
    public IItemDefinition essentiaCellCreative() {
        return this.itemEssentiaCellCreative;
    }

    @Override
    public IItemDefinition essentiaImportBus() {
        return this.itemEssentiaImportBus;
    }

    @Override
    public IItemDefinition essentiaExportBus() {
        return this.itemEssentiaExportBus;
    }

    @Override
    public IItemDefinition essentiaStorageBus() {
        return this.itemEssentiaStorageBus;
    }

    @Override
    public IItemDefinition essentiaTerminal() {
        return this.itemEssentiaTerminal;
    }

    @Override
    public IItemDefinition arcaneTerminal() {
        return this.itemArcaneTerminal;
    }

    @Override
    public IItemDefinition arcaneInscriber() {
        return this.itemArcaneInscriber;
    }

    @Override
    public IItemDefinition diffusionCore() {
        return this.itemDiffusionCore;
    }

    @Override
    public IItemDefinition coalescenceCore() {
        return this.itemCoalescenceCore;
    }
    @Override
    public IItemDefinition primalIngot() {
        return this.itemPrimalIngot;
    }

    @Override
    public IItemDefinition AdvEssentiaCellCasing() {
        return null;
    }
    @Override
    public IItemDefinition essentiaComponent1k() {
        return this.itemEssentiaComponent1k;
    }

    @Override
    public IItemDefinition essentiaComponent4k() {
        return this.itemEssentiaComponent4k;
    }

    @Override
    public IItemDefinition essentiaComponent16k() {
        return this.itemEssentiaComponent16k;
    }

    @Override
    public IItemDefinition essentiaComponent64k() {
        return this.itemEssentiaComponent64k;
    }
    @Override
    public IItemDefinition essentiaComponent256k() {
        return this.itemEssentiaComponent256k;
    }
    @Override
    public IItemDefinition essentiaComponent1024k() {
        return this.itemEssentiaComponent1024k;
    }
    @Override
    public IItemDefinition essentiaComponent4096k() {
        return this.itemEssentiaComponent4096k;
    }

    @Override
    public IItemDefinition essentiaComponent16kk() {
        return null;
    }

    @Override
    public IItemDefinition essentiaComponent65kk() {
        return null;
    }

    @Override
    public IItemDefinition essentiaComponent262kk() {
        return null;
    }

    @Override
    public IItemDefinition essentiaComponent1048kk() {
        return null;
    }

    @Override
    public IItemDefinition essentiaComponent16384k() {
        return this.itemEssentiaComponent16384k;
    }
    @Override
    public IItemDefinition essentiaComponent65536k() {
        return this.itemEssentiaComponent65536k;
    }
    @Override
    public IItemDefinition essentiaComponent262144k() {
        return this.itemEssentiaComponent262144k;
    }
    @Override
    public IItemDefinition essentiaComponent1048576k() {
        return this.itemEssentiaComponent1048576k;
    }















    @Override
    public IItemDefinition upgradeArcane() {
        return this.itemUpgradeArcane;
    }

    @Override
    public IItemDefinition superupgradeArcane() {
        return this.itemUpgradeArcane;
    }

    @Override
    public IItemDefinition knowledgeCore() {
        return this.itemKnowledgeCore;
    }

    @Override
    public IItemDefinition blankKnowledgeCore() {
        return this.itemBlankKnowledgeCore;
    }

    @Override
    public IItemDefinition dummyAspect() {
        return this.itemDummyAspect;
    }

}



